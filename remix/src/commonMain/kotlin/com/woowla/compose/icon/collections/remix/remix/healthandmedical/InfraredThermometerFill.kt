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

public val HealthAndMedicalGroup.InfraredThermometerFill: ImageVector
    get() {
        if (_infraredThermometerFill != null) {
            return _infraredThermometerFill!!
        }
        _infraredThermometerFill = Builder(name = "InfraredThermometerFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.999f)
                lineTo(18.0f, 12.0f)
                curveTo(18.0f, 14.209f, 16.209f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(12.621f)
                lineTo(12.008f, 19.111f)
                lineTo(12.919f, 20.432f)
                curveTo(13.233f, 20.887f, 13.118f, 21.51f, 12.663f, 21.823f)
                curveTo(12.497f, 21.938f, 12.299f, 22.0f, 12.096f, 22.0f)
                horizontalLineTo(3.0f)
                lineTo(5.313f, 11.976f)
                lineTo(3.0f, 11.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(15.999f, 11.0f)
                horizontalLineTo(13.605f)
                lineTo(13.014f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 14.0f, 16.0f, 13.105f, 16.0f, 12.0f)
                lineTo(15.999f, 11.0f)
                close()
            }
        }
        .build()
        return _infraredThermometerFill!!
    }

private var _infraredThermometerFill: ImageVector? = null
