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

public val HealthAndMedicalGroup.DislikeLine: ImageVector
    get() {
        if (_dislikeLine != null) {
            return _dislikeLine!!
        }
        _dislikeLine = Builder(name = "DislikeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineTo(21.192f, 19.778f)
                lineTo(19.778f, 21.192f)
                lineTo(16.032f, 17.445f)
                lineTo(12.0f, 21.485f)
                lineTo(3.522f, 12.993f)
                curveTo(1.482f, 10.709f, 1.493f, 7.24f, 3.555f, 4.97f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(4.98f, 11.623f)
                lineTo(12.0f, 18.654f)
                lineTo(14.618f, 16.031f)
                lineTo(4.972f, 6.386f)
                curveTo(3.678f, 7.883f, 3.671f, 10.121f, 4.98f, 11.623f)
                close()
                moveTo(20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.637f, 20.479f, 12.993f)
                lineTo(18.844f, 14.629f)
                lineTo(17.43f, 13.215f)
                lineTo(19.02f, 11.623f)
                curveTo(20.394f, 10.047f, 20.319f, 7.665f, 18.827f, 6.17f)
                curveTo(17.328f, 4.668f, 14.908f, 4.607f, 13.337f, 6.017f)
                lineTo(12.002f, 7.215f)
                lineTo(10.666f, 6.018f)
                curveTo(10.316f, 5.704f, 9.925f, 5.463f, 9.511f, 5.295f)
                lineTo(7.26f, 3.046f)
                curveTo(8.929f, 2.839f, 10.668f, 3.334f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
            }
        }
        .build()
        return _dislikeLine!!
    }

private var _dislikeLine: ImageVector? = null
