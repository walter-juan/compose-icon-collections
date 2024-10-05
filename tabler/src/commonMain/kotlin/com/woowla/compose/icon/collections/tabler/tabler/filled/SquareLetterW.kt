package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.SquareLetterW: ImageVector
    get() {
        if (_squareLetterW != null) {
            return _squareLetterW!!
        }
        _squareLetterW = Builder(name = "SquareLetterW", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(14.008f, 7.876f)
                lineToRelative(-0.52f, 4.153f)
                lineToRelative(-0.56f, -1.4f)
                curveToRelative(-0.319f, -0.799f, -1.41f, -0.837f, -1.803f, -0.114f)
                lineToRelative(-0.053f, 0.114f)
                lineToRelative(-0.561f, 1.4f)
                lineToRelative(-0.519f, -4.153f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -0.876f)
                lineToRelative(-0.116f, 0.008f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.868f, 1.116f)
                lineToRelative(1.0f, 8.0f)
                curveToRelative(0.128f, 1.025f, 1.537f, 1.207f, 1.92f, 0.247f)
                lineToRelative(1.072f, -2.678f)
                lineToRelative(1.072f, 2.678f)
                curveToRelative(0.383f, 0.96f, 1.792f, 0.778f, 1.92f, -0.247f)
                lineToRelative(1.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.984f, -0.248f)
            }
        }
        .build()
        return _squareLetterW!!
    }

private var _squareLetterW: ImageVector? = null
