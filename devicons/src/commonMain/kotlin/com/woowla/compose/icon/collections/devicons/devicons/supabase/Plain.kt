package com.woowla.compose.icon.collections.devicons.devicons.supabase

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SupabaseGroup

public val SupabaseGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.06f, 0.01f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, -4.56f, 2.13f)
                lineTo(4.14f, 64.28f)
                curveToRelative(-5.82f, 7.33f, -0.6f, 18.15f, 8.76f, 18.15f)
                horizontalLineToRelative(50.98f)
                lineToRelative(0.55f, 39.86f)
                curveToRelative(0.0f, 3.63f, 2.59f, 5.7f, 5.7f, 5.7f)
                curveToRelative(1.56f, 0.0f, 3.11f, -0.52f, 4.15f, -2.08f)
                lineToRelative(49.31f, -62.2f)
                curveToRelative(6.22f, -7.26f, 1.04f, -18.15f, -8.31f, -18.15f)
                lineTo(63.74f, 45.57f)
                lineToRelative(-0.26f, -40.04f)
                curveToRelative(-0.05f, -3.29f, -2.66f, -5.4f, -5.41f, -5.52f)
                close()
                moveTo(68.59f, 50.76f)
                horizontalLineToRelative(46.71f)
                curveToRelative(2.59f, 0.0f, 4.15f, 1.04f, 5.19f, 3.63f)
                curveToRelative(1.04f, 2.07f, 0.52f, 4.67f, -0.52f, 6.22f)
                lineToRelative(-49.3f, 62.19f)
                horizontalLineToRelative(-0.53f)
                reflectiveCurveToRelative(-0.52f, 0.0f, -0.52f, -0.52f)
                lineTo(68.58f, 50.75f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
