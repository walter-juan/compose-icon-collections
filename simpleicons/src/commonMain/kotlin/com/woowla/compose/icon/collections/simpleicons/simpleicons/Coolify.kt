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

public val Simpleicons.Coolify: ImageVector
    get() {
        if (_coolify != null) {
            return _coolify!!
        }
        _coolify = Builder(name = "Coolify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.364f, 4.364f)
                lineTo(4.364f, 0.0f)
                horizontalLineToRelative(17.454f)
                verticalLineToRelative(4.364f)
                close()
                moveTo(4.364f, 17.454f)
                lineTo(0.0f, 17.454f)
                lineTo(0.0f, 4.365f)
                horizontalLineToRelative(4.364f)
                close()
                moveTo(4.364f, 17.454f)
                horizontalLineToRelative(17.454f)
                verticalLineToRelative(4.364f)
                lineTo(4.364f, 21.818f)
                close()
                moveTo(6.545f, 6.546f)
                verticalLineToRelative(-1.7f)
                lineTo(22.3f, 4.846f)
                lineTo(22.3f, 2.182f)
                lineTo(24.0f, 2.182f)
                verticalLineToRelative(4.363f)
                close()
                moveTo(6.545f, 6.546f)
                verticalLineToRelative(10.4f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(-10.4f)
                close()
                moveTo(3.882f, 17.936f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(-1.7f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(6.545f, 24.0f)
                verticalLineToRelative(-1.7f)
                lineTo(22.3f, 22.3f)
                verticalLineToRelative(-2.664f)
                lineTo(24.0f, 19.636f)
                close()
            }
        }
        .build()
        return _coolify!!
    }

private var _coolify: ImageVector? = null
