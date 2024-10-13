package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBulb: ImageVector
    get() {
        if (_bxsBulb != null) {
            return _bxsBulb!!
        }
        _bxsBulb = Builder(name = "BxsBulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 22.0f)
                close()
                moveTo(16.906f, 13.712f)
                curveTo(17.936f, 12.506f, 19.0f, 11.259f, 19.0f, 9.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(5.0f, 5.141f, 5.0f, 9.0f)
                curveToRelative(0.0f, 2.285f, 1.067f, 3.528f, 2.101f, 4.73f)
                curveToRelative(0.358f, 0.418f, 0.729f, 0.851f, 1.084f, 1.349f)
                curveToRelative(0.144f, 0.206f, 0.38f, 0.996f, 0.591f, 1.921f)
                horizontalLineToRelative(-0.792f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.032f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(0.213f, -0.927f, 0.45f, -1.719f, 0.593f, -1.925f)
                curveToRelative(0.352f, -0.503f, 0.726f, -0.94f, 1.087f, -1.363f)
                close()
            }
        }
        .build()
        return _bxsBulb!!
    }

private var _bxsBulb: ImageVector? = null
