package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 22.5f)
                curveTo(21.157f, 22.5f, 22.5f, 21.157f, 22.5f, 19.5f)
                verticalLineTo(11.326f)
                lineTo(15.621f, 15.348f)
                lineTo(19.106f, 17.224f)
                curveTo(19.47f, 17.421f, 19.607f, 17.875f, 19.41f, 18.24f)
                curveTo(19.214f, 18.605f, 18.759f, 18.741f, 18.394f, 18.545f)
                lineTo(12.711f, 15.485f)
                curveTo(12.267f, 15.246f, 11.733f, 15.246f, 11.289f, 15.485f)
                lineTo(5.606f, 18.545f)
                curveTo(5.241f, 18.741f, 4.786f, 18.605f, 4.59f, 18.24f)
                curveTo(4.393f, 17.875f, 4.53f, 17.421f, 4.894f, 17.224f)
                lineTo(8.379f, 15.348f)
                lineTo(1.5f, 11.326f)
                verticalLineTo(19.5f)
                curveTo(1.5f, 21.157f, 2.843f, 22.5f, 4.5f, 22.5f)
                lineTo(19.5f, 22.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 9.589f)
                verticalLineTo(8.844f)
                curveTo(1.5f, 7.74f, 2.106f, 6.726f, 3.078f, 6.202f)
                lineTo(10.578f, 2.164f)
                curveTo(11.466f, 1.686f, 12.534f, 1.686f, 13.422f, 2.164f)
                lineTo(20.922f, 6.202f)
                curveTo(21.894f, 6.726f, 22.5f, 7.74f, 22.5f, 8.844f)
                verticalLineTo(9.589f)
                lineTo(14.074f, 14.515f)
                lineTo(13.422f, 14.164f)
                curveTo(12.534f, 13.686f, 11.466f, 13.686f, 10.578f, 14.164f)
                lineTo(9.926f, 14.515f)
                lineTo(1.5f, 9.589f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
