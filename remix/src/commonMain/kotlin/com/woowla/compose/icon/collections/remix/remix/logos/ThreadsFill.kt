package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.ThreadsFill: ImageVector
    get() {
        if (_threadsFill != null) {
            return _threadsFill!!
        }
        _threadsFill = Builder(name = "ThreadsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.705f, 11.108f)
                curveTo(16.543f, 8.121f, 14.911f, 6.411f, 12.171f, 6.394f)
                curveTo(10.519f, 6.384f, 9.138f, 7.084f, 8.292f, 8.367f)
                lineTo(9.799f, 9.4f)
                curveTo(10.433f, 8.439f, 11.434f, 8.24f, 12.159f, 8.247f)
                curveTo(13.062f, 8.253f, 13.743f, 8.515f, 14.183f, 9.027f)
                curveTo(14.504f, 9.399f, 14.718f, 9.914f, 14.825f, 10.563f)
                curveTo(14.025f, 10.427f, 13.159f, 10.385f, 12.234f, 10.439f)
                curveTo(9.629f, 10.589f, 7.954f, 12.108f, 8.067f, 14.219f)
                curveTo(8.124f, 15.29f, 8.657f, 16.212f, 9.569f, 16.814f)
                curveTo(10.34f, 17.323f, 11.333f, 17.571f, 12.364f, 17.515f)
                curveTo(13.727f, 17.44f, 14.796f, 16.92f, 15.542f, 15.97f)
                curveTo(16.108f, 15.248f, 16.466f, 14.313f, 16.624f, 13.134f)
                curveTo(17.274f, 13.526f, 17.755f, 14.041f, 18.021f, 14.661f)
                curveTo(18.473f, 15.715f, 18.499f, 17.447f, 17.086f, 18.859f)
                curveTo(15.848f, 20.096f, 14.36f, 20.631f, 12.111f, 20.647f)
                curveTo(9.616f, 20.629f, 7.729f, 19.829f, 6.503f, 18.269f)
                curveTo(5.354f, 16.809f, 4.76f, 14.7f, 4.738f, 12.0f)
                curveTo(4.76f, 9.3f, 5.354f, 7.191f, 6.503f, 5.731f)
                curveTo(7.729f, 4.171f, 9.616f, 3.371f, 12.111f, 3.353f)
                curveTo(14.624f, 3.372f, 16.543f, 4.175f, 17.817f, 5.742f)
                curveTo(18.441f, 6.511f, 18.912f, 7.477f, 19.223f, 8.604f)
                lineTo(20.989f, 8.133f)
                curveTo(20.612f, 6.746f, 20.021f, 5.551f, 19.215f, 4.56f)
                curveTo(17.582f, 2.551f, 15.182f, 1.521f, 12.105f, 1.5f)
                curveTo(9.034f, 1.521f, 6.673f, 2.555f, 5.086f, 4.571f)
                curveTo(3.675f, 6.366f, 2.946f, 8.877f, 2.922f, 12.007f)
                curveTo(2.946f, 15.137f, 3.675f, 17.634f, 5.086f, 19.429f)
                curveTo(6.673f, 21.445f, 9.046f, 22.479f, 12.117f, 22.5f)
                curveTo(14.847f, 22.481f, 16.771f, 21.766f, 18.357f, 20.183f)
                curveTo(20.431f, 18.11f, 20.368f, 15.513f, 19.685f, 13.918f)
                curveTo(19.16f, 12.694f, 18.114f, 11.713f, 16.705f, 11.108f)
                close()
                moveTo(12.267f, 15.665f)
                curveTo(11.125f, 15.729f, 9.939f, 15.217f, 9.88f, 14.119f)
                curveTo(9.837f, 13.305f, 10.46f, 12.397f, 12.337f, 12.288f)
                curveTo(13.259f, 12.235f, 14.114f, 12.298f, 14.87f, 12.463f)
                curveTo(14.654f, 15.165f, 13.385f, 15.604f, 12.267f, 15.665f)
                close()
            }
        }
        .build()
        return _threadsFill!!
    }

private var _threadsFill: ImageVector? = null
