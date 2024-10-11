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

public val HealthAndMedicalGroup.LungsLine: ImageVector
    get() {
        if (_lungsLine != null) {
            return _lungsLine!!
        }
        _lungsLine = Builder(name = "LungsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.001f, 17.0f)
                curveTo(22.0f, 21.0f, 22.0f, 21.0f, 18.001f, 21.0f)
                curveTo(14.001f, 21.0f, 13.001f, 18.0f, 13.001f, 15.0f)
                curveTo(13.001f, 14.622f, 12.983f, 14.082f, 12.975f, 13.45f)
                lineTo(14.998f, 14.619f)
                lineTo(15.001f, 15.0f)
                curveTo(15.001f, 17.776f, 15.817f, 19.0f, 18.001f, 19.0f)
                curveTo(19.142f, 19.0f, 19.612f, 18.993f, 19.964f, 18.962f)
                curveTo(19.994f, 18.611f, 20.001f, 18.14f, 20.001f, 17.0f)
                curveTo(20.001f, 13.795f, 19.298f, 10.967f, 18.166f, 9.099f)
                curveTo(17.328f, 7.718f, 16.553f, 7.258f, 16.134f, 7.397f)
                curveTo(15.841f, 7.495f, 15.529f, 8.047f, 15.303f, 9.02f)
                lineTo(13.512f, 7.987f)
                curveTo(13.882f, 6.79f, 14.495f, 5.836f, 15.501f, 5.5f)
                curveTo(18.501f, 4.5f, 22.004f, 9.5f, 22.001f, 17.0f)
                close()
                moveTo(8.5f, 5.5f)
                curveTo(9.507f, 5.836f, 10.119f, 6.79f, 10.489f, 7.987f)
                lineTo(8.699f, 9.02f)
                curveTo(8.473f, 8.047f, 8.16f, 7.495f, 7.868f, 7.397f)
                curveTo(7.448f, 7.258f, 6.673f, 7.718f, 5.836f, 9.099f)
                curveTo(4.703f, 10.967f, 4.0f, 13.795f, 4.0f, 17.0f)
                curveTo(4.0f, 18.14f, 4.007f, 18.611f, 4.037f, 18.962f)
                curveTo(4.389f, 18.993f, 4.86f, 19.0f, 6.0f, 19.0f)
                curveTo(8.184f, 19.0f, 9.0f, 17.776f, 9.0f, 15.0f)
                lineTo(9.004f, 14.618f)
                lineTo(11.027f, 13.45f)
                curveTo(11.018f, 14.083f, 11.0f, 14.622f, 11.0f, 15.0f)
                curveTo(11.0f, 18.0f, 10.0f, 21.0f, 6.0f, 21.0f)
                curveTo(2.0f, 21.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                curveTo(2.0f, 9.5f, 5.501f, 4.5f, 8.5f, 5.5f)
                close()
                moveTo(13.0f, 2.0f)
                lineTo(13.0f, 9.422f)
                lineTo(17.696f, 12.134f)
                lineTo(16.696f, 13.866f)
                lineTo(12.0f, 11.155f)
                lineTo(7.304f, 13.866f)
                lineTo(6.304f, 12.134f)
                lineTo(11.0f, 9.422f)
                lineTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _lungsLine!!
    }

private var _lungsLine: ImageVector? = null
