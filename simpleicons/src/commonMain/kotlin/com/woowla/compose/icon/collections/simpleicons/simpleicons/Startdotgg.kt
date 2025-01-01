package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Startdotgg: ImageVector
    get() {
        if (_startdotgg != null) {
            return _startdotgg!!
        }
        _startdotgg = Builder(name = "Startdotgg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                arcTo(5.999f, 5.999f, 0.0f, false, false, 0.002f, 6.0f)
                verticalLineToRelative(5.252f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, 0.748f)
                lineTo(5.25f, 12.0f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, 0.75f, -0.747f)
                lineTo(6.0f, 6.749f)
                curveTo(6.0f, 6.334f, 6.336f, 6.0f, 6.748f, 6.0f)
                horizontalLineToRelative(16.497f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, 0.749f, -0.748f)
                lineTo(23.994f, 0.749f)
                arcTo(0.743f, 0.743f, 0.0f, false, false, 23.247f, 0.0f)
                close()
                moveTo(18.75f, 12.0f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.747f, 0.748f)
                lineTo(0.753f, 17.998f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, false, -0.75f, 0.751f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, 0.751f)
                lineTo(18.0f, 24.0f)
                arcToRelative(5.999f, 5.999f, 0.0f, false, false, 5.999f, -6.0f)
                verticalLineToRelative(-5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _startdotgg!!
    }

private var _startdotgg: ImageVector? = null
