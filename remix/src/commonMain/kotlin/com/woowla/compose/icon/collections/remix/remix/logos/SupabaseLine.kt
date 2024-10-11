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

public val LogosGroup.SupabaseLine: ImageVector
    get() {
        if (_supabaseLine != null) {
            return _supabaseLine!!
        }
        _supabaseLine = Builder(name = "SupabaseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.598f)
                verticalLineTo(13.969f)
                horizontalLineTo(3.9f)
                curveTo(3.231f, 13.969f, 2.831f, 13.185f, 3.257f, 12.633f)
                lineTo(11.0f, 2.598f)
                close()
                moveTo(13.0f, 8.031f)
                verticalLineTo(2.333f)
                curveTo(13.0f, 0.522f, 10.703f, -0.291f, 9.582f, 1.162f)
                lineTo(1.673f, 11.411f)
                curveTo(0.246f, 13.26f, 1.548f, 15.969f, 3.9f, 15.969f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.667f)
                curveTo(11.0f, 23.479f, 13.296f, 24.292f, 14.417f, 22.838f)
                lineTo(22.326f, 12.589f)
                curveTo(23.753f, 10.74f, 22.452f, 8.031f, 20.099f, 8.031f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 10.031f)
                horizontalLineTo(20.099f)
                curveTo(20.769f, 10.031f, 21.169f, 10.816f, 20.743f, 11.367f)
                lineTo(13.0f, 21.402f)
                verticalLineTo(10.031f)
                close()
            }
        }
        .build()
        return _supabaseLine!!
    }

private var _supabaseLine: ImageVector? = null
