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

public val FilledGroup.SquareLetterK: ImageVector
    get() {
        if (_squareLetterK != null) {
            return _squareLetterK!!
        }
        _squareLetterK = Builder(name = "SquareLetterK", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.53f, 7.152f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.378f, 0.318f)
                lineToRelative(-2.152f, 3.443f)
                verticalLineToRelative(-2.913f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(2.152f, 3.444f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.276f, 0.374f)
                lineToRelative(0.102f, -0.056f)
                lineToRelative(0.095f, -0.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.223f, -1.31f)
                lineToRelative(-2.17f, -3.47f)
                lineToRelative(2.17f, -3.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.318f, -1.378f)
            }
        }
        .build()
        return _squareLetterK!!
    }

private var _squareLetterK: ImageVector? = null
