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

public val LogosGroup.SupabaseFill: ImageVector
    get() {
        if (_supabaseFill != null) {
            return _supabaseFill!!
        }
        _supabaseFill = Builder(name = "SupabaseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.084f, 15.25f)
                curveTo(1.42f, 15.25f, 0.484f, 13.338f, 1.504f, 12.024f)
                lineTo(10.21f, 0.806f)
                curveTo(10.794f, 0.054f, 12.0f, 0.467f, 12.0f, 1.419f)
                verticalLineTo(8.75f)
                horizontalLineTo(20.916f)
                curveTo(22.579f, 8.75f, 23.516f, 10.662f, 22.496f, 11.976f)
                lineTo(13.79f, 23.194f)
                curveTo(13.206f, 23.946f, 12.0f, 23.533f, 12.0f, 22.58f)
                verticalLineTo(15.25f)
                horizontalLineTo(3.084f)
                close()
            }
        }
        .build()
        return _supabaseFill!!
    }

private var _supabaseFill: ImageVector? = null
