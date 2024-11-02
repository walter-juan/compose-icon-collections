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

public val SolidGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.881f, 4.345f)
                curveTo(14.81f, 5.174f, 12.592f, 5.713f, 10.276f, 5.913f)
                curveTo(9.608f, 5.971f, 8.933f, 6.0f, 8.25f, 6.0f)
                horizontalLineTo(7.5f)
                curveTo(4.601f, 6.0f, 2.25f, 8.351f, 2.25f, 11.25f)
                curveTo(2.25f, 13.85f, 4.139f, 16.008f, 6.62f, 16.427f)
                curveTo(6.954f, 17.796f, 7.418f, 19.114f, 7.998f, 20.367f)
                curveTo(8.462f, 21.371f, 9.672f, 21.688f, 10.58f, 21.163f)
                lineTo(11.237f, 20.784f)
                curveTo(12.117f, 20.276f, 12.402f, 19.191f, 12.009f, 18.316f)
                curveTo(11.774f, 17.794f, 11.564f, 17.257f, 11.381f, 16.709f)
                curveTo(13.299f, 16.967f, 15.142f, 17.459f, 16.881f, 18.155f)
                curveTo(17.607f, 15.985f, 18.0f, 13.663f, 18.0f, 11.25f)
                curveTo(18.0f, 8.836f, 17.607f, 6.515f, 16.881f, 4.345f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.261f, 3.741f)
                curveTo(19.064f, 6.096f, 19.5f, 8.622f, 19.5f, 11.25f)
                curveTo(19.5f, 13.878f, 19.064f, 16.404f, 18.261f, 18.759f)
                curveTo(18.205f, 18.921f, 18.149f, 19.082f, 18.09f, 19.242f)
                curveTo(17.948f, 19.631f, 18.148f, 20.062f, 18.537f, 20.204f)
                curveTo(18.926f, 20.347f, 19.356f, 20.147f, 19.499f, 19.758f)
                curveTo(19.639f, 19.375f, 19.77f, 18.988f, 19.891f, 18.597f)
                curveTo(20.415f, 16.911f, 20.763f, 15.147f, 20.914f, 13.328f)
                curveTo(21.431f, 12.789f, 21.75f, 12.057f, 21.75f, 11.25f)
                curveTo(21.75f, 10.443f, 21.431f, 9.711f, 20.914f, 9.172f)
                curveTo(20.763f, 7.353f, 20.415f, 5.589f, 19.891f, 3.903f)
                curveTo(19.77f, 3.512f, 19.639f, 3.125f, 19.499f, 2.742f)
                curveTo(19.356f, 2.353f, 18.926f, 2.153f, 18.537f, 2.296f)
                curveTo(18.148f, 2.438f, 17.948f, 2.869f, 18.09f, 3.258f)
                curveTo(18.149f, 3.418f, 18.205f, 3.579f, 18.261f, 3.741f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
