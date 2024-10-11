package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(5.03f, 5.03f, 0.0f, false, true, -0.438f, 2.001f)
                lineToRelative(0.438f, -0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1.263f)
                lineToRelative(1.24f, 5.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.747f, 1.184f)
                lineToRelative(-0.113f, 0.02f)
                lineToRelative(-0.117f, 0.006f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, -1.093f)
                lineToRelative(0.018f, -0.117f)
                lineToRelative(1.24f, -5.79f)
                horizontalLineToRelative(-1.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(0.438f)
                arcToRelative(5.154f, 5.154f, 0.0f, false, true, -0.412f, -1.525f)
                lineToRelative(-0.02f, -0.259f)
                lineToRelative(-0.006f, -0.216f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.998f, -1.058f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
