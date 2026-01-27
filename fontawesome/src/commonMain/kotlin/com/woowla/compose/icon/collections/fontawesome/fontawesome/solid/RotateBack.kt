package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.RotateBack: ImageVector
    get() {
        if (_rotateBack != null) {
            return _rotateBack!!
        }
        _rotateBack = Builder(name = "RotateBack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 192.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(9.7f, 0.0f, 18.5f, -5.8f, 22.2f, -14.8f)
                reflectiveCurveToRelative(1.7f, -19.3f, -5.2f, -26.2f)
                lineToRelative(-46.7f, -46.7f)
                curveToRelative(75.3f, -58.6f, 184.3f, -53.3f, 253.5f, 15.9f)
                curveToRelative(75.0f, 75.0f, 75.0f, 196.5f, 0.0f, 271.5f)
                reflectiveCurveToRelative(-196.5f, 75.0f, -271.5f, 0.0f)
                curveToRelative(-10.2f, -10.2f, -19.0f, -21.3f, -26.4f, -33.0f)
                curveToRelative(-9.5f, -14.9f, -29.3f, -19.3f, -44.2f, -9.8f)
                reflectiveCurveToRelative(-19.3f, 29.3f, -9.8f, 44.2f)
                curveTo(49.7f, 408.7f, 61.4f, 423.5f, 75.0f, 437.0f)
                curveTo(175.0f, 537.0f, 337.0f, 537.0f, 437.0f, 437.0f)
                reflectiveCurveTo(537.0f, 175.0f, 437.0f, 75.0f)
                curveTo(342.8f, -19.3f, 193.3f, -24.7f, 92.7f, 58.8f)
                lineTo(41.0f, 7.0f)
                curveTo(34.1f, 0.2f, 23.8f, -1.9f, 14.8f, 1.8f)
                reflectiveCurveTo(0.0f, 14.3f, 0.0f, 24.0f)
                lineTo(0.0f, 168.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _rotateBack!!
    }

private var _rotateBack: ImageVector? = null
