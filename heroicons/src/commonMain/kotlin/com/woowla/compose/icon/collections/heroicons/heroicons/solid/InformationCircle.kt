package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.InformationCircle: ImageVector
    get() {
        if (_informationCircle != null) {
            return _informationCircle!!
        }
        _informationCircle = Builder(name = "InformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 6.615f, 6.615f, 2.25f, 12.0f, 2.25f)
                curveTo(17.385f, 2.25f, 21.75f, 6.615f, 21.75f, 12.0f)
                curveTo(21.75f, 17.385f, 17.385f, 21.75f, 12.0f, 21.75f)
                curveTo(6.615f, 21.75f, 2.25f, 17.385f, 2.25f, 12.0f)
                close()
                moveTo(10.956f, 10.558f)
                curveTo(12.102f, 9.985f, 13.393f, 11.021f, 13.082f, 12.264f)
                lineTo(12.373f, 15.1f)
                lineTo(12.415f, 15.079f)
                curveTo(12.785f, 14.894f, 13.236f, 15.044f, 13.421f, 15.415f)
                curveTo(13.606f, 15.785f, 13.456f, 16.236f, 13.086f, 16.421f)
                lineTo(13.044f, 16.442f)
                curveTo(11.898f, 17.015f, 10.607f, 15.979f, 10.918f, 14.736f)
                lineTo(11.627f, 11.9f)
                lineTo(11.586f, 11.921f)
                curveTo(11.215f, 12.106f, 10.765f, 11.956f, 10.579f, 11.585f)
                curveTo(10.394f, 11.215f, 10.544f, 10.764f, 10.915f, 10.579f)
                lineTo(10.956f, 10.558f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.414f, 9.0f, 12.75f, 8.664f, 12.75f, 8.25f)
                curveTo(12.75f, 7.836f, 12.414f, 7.5f, 12.0f, 7.5f)
                curveTo(11.586f, 7.5f, 11.25f, 7.836f, 11.25f, 8.25f)
                curveTo(11.25f, 8.664f, 11.586f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _informationCircle!!
    }

private var _informationCircle: ImageVector? = null
