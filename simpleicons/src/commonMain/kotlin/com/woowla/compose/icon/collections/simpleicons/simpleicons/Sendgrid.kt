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

public val Simpleicons.Sendgrid: ImageVector
    get() {
        if (_sendgrid != null) {
            return _sendgrid!!
        }
        _sendgrid = Builder(name = "Sendgrid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.8f, 24.0f)
                horizontalLineToRelative(13.6f)
                curveToRelative(0.88f, 0.0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                horizontalLineTo(9.6f)
                curveToRelative(-0.88f, 0.0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineTo(9.6f)
                curveTo(8.0f, 8.72f, 7.28f, 8.0f, 6.4f, 8.0f)
                horizontalLineTo(1.6f)
                curveTo(0.72f, 8.0f, 0.0f, 8.72f, 0.0f, 9.6f)
                verticalLineToRelative(13.6f)
                curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.8f, 0.8f)
                close()
                moveTo(23.2f, 0.0f)
                horizontalLineTo(9.6f)
                curveTo(8.72f, 0.0f, 8.0f, 0.72f, 8.0f, 1.6f)
                verticalLineToRelative(4.8f)
                curveTo(8.0f, 7.28f, 8.72f, 8.0f, 9.6f, 8.0f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(4.8f)
                curveToRelative(0.0f, 0.88f, 0.72f, 1.6f, 1.6f, 1.6f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.88f, 0.0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineTo(0.8f)
                curveToRelative(0.0f, -0.44f, -0.36f, -0.8f, -0.8f, -0.8f)
                close()
            }
        }
        .build()
        return _sendgrid!!
    }

private var _sendgrid: ImageVector? = null
