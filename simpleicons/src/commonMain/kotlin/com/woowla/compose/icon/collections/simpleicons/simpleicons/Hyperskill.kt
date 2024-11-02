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

public val Simpleicons.Hyperskill: ImageVector
    get() {
        if (_hyperskill != null) {
            return _hyperskill!!
        }
        _hyperskill = Builder(name = "Hyperskill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.6f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, 1.4f)
                horizontalLineToRelative(-1.2f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, -1.4f)
                lineTo(18.0f, 1.4f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 19.4f, 0.0f)
                horizontalLineToRelative(1.2f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 22.0f, 1.4f)
                close()
                moveTo(14.0f, 8.6f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, 1.4f)
                horizontalLineToRelative(-1.2f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 10.0f, 8.6f)
                lineTo(10.0f, 3.4f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 11.4f, 2.0f)
                horizontalLineToRelative(1.2f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 14.0f, 3.4f)
                close()
                moveTo(5.999f, 16.6f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, 1.4f)
                lineTo(3.4f, 18.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 2.0f, 16.6f)
                lineTo(2.0f, 7.4f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 3.4f, 6.0f)
                horizontalLineToRelative(1.2f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 6.0f, 7.4f)
                verticalLineToRelative(9.2f)
                close()
                moveTo(14.0f, 20.6f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, 1.4f)
                horizontalLineToRelative(-1.2f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, -1.4f)
                verticalLineToRelative(-5.2f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 1.4f, -1.4f)
                horizontalLineToRelative(1.2f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 1.4f, 1.4f)
                close()
            }
        }
        .build()
        return _hyperskill!!
    }

private var _hyperskill: ImageVector? = null
