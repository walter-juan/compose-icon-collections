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

public val Simpleicons.Freecad: ImageVector
    get() {
        if (_freecad != null) {
            return _freecad!!
        }
        _freecad = Builder(name = "Freecad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(7.996f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.288f, 0.566f)
                lineToRelative(-2.173f, 1.58f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.289f, 0.565f)
                verticalLineToRelative(0.586f)
                curveToRelative(0.0f, 0.224f, 0.107f, 0.434f, 0.289f, 0.566f)
                lineToRelative(1.895f, 1.377f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.254f, 0.783f)
                lineToRelative(-0.649f, 1.997f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.665f, 0.484f)
                lineTo(18.03f, 16.5f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.566f, 0.288f)
                lineToRelative(-0.344f, 0.474f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.1f, 0.627f)
                lineToRelative(0.724f, 2.229f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.254f, 0.782f)
                lineToRelative(-1.699f, 1.234f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.823f, 0.0f)
                lineToRelative(-1.895f, -1.377f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.628f, -0.099f)
                lineToRelative(-0.556f, 0.18f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.45f, 0.45f)
                lineToRelative(-0.724f, 2.228f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.665f, 0.484f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 4.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(18.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _freecad!!
    }

private var _freecad: ImageVector? = null
