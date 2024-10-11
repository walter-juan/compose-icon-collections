package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Dumpling: ImageVector
    get() {
        if (_dumpling != null) {
            return _dumpling!!
        }
        _dumpling = Builder(name = "Dumpling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.532f, 5.532f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 2.56f, -0.623f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, true, 4.604f, -0.717f)
                quadToRelative(0.146f, -0.24f, 0.356f, -0.45f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, true, 4.318f, 1.637f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 2.844f, 0.511f)
                lineToRelative(0.358f, 0.358f)
                curveToRelative(1.384f, 1.385f, -0.7f, 5.713f, -4.655f, 9.669f)
                curveToRelative(-3.956f, 3.955f, -8.284f, 6.04f, -9.669f, 4.655f)
                lineToRelative(-0.358f, -0.358f)
                lineToRelative(-0.114f, -0.122f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, -0.398f, -2.724f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, true, -1.186f, -4.675f)
                arcToRelative(2.532f, 2.532f, 0.0f, false, true, 0.718f, -4.603f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 0.622f, -2.558f)
            }
        }
        .build()
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
