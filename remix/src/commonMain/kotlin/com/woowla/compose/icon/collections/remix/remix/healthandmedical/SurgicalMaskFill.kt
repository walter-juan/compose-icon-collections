package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.SurgicalMaskFill: ImageVector
    get() {
        if (_surgicalMaskFill != null) {
            return _surgicalMaskFill!!
        }
        _surgicalMaskFill = Builder(name = "SurgicalMaskFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.485f, 3.121f)
                lineTo(20.243f, 5.061f)
                curveTo(20.688f, 5.172f, 21.0f, 5.572f, 21.0f, 6.031f)
                verticalLineTo(7.0f)
                lineTo(22.0f, 7.0f)
                curveTo(23.1f, 7.0f, 24.0f, 7.9f, 24.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(24.0f, 13.657f, 22.657f, 15.0f, 21.0f, 15.0f)
                lineTo(20.579f, 15.0f)
                curveTo(20.044f, 16.35f, 19.028f, 17.486f, 17.683f, 18.158f)
                lineTo(12.894f, 20.553f)
                curveTo(12.331f, 20.834f, 11.669f, 20.834f, 11.106f, 20.553f)
                lineTo(6.317f, 18.158f)
                curveTo(4.973f, 17.486f, 3.956f, 16.35f, 3.421f, 15.0f)
                lineTo(3.0f, 15.0f)
                curveTo(1.343f, 15.0f, 0.0f, 13.657f, 0.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(0.0f, 7.895f, 0.895f, 7.0f, 2.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(6.031f)
                curveTo(3.0f, 5.572f, 3.312f, 5.172f, 3.757f, 5.061f)
                lineTo(11.515f, 3.121f)
                curveTo(11.833f, 3.042f, 12.167f, 3.042f, 12.485f, 3.121f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 12.552f, 2.448f, 13.0f, 3.0f, 13.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                curveTo(21.552f, 13.0f, 22.0f, 12.552f, 22.0f, 12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _surgicalMaskFill!!
    }

private var _surgicalMaskFill: ImageVector? = null
