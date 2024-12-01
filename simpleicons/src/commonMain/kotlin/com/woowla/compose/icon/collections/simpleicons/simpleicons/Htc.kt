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

public val Simpleicons.Htc: ImageVector
    get() {
        if (_htc != null) {
            return _htc!!
        }
        _htc = Builder(name = "Htc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.75f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.7f, -0.05f, -1.15f, -0.5f, -1.2f, -1.15f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0.05f, -0.65f, 0.6f, -1.25f, 1.2f, -1.25f)
                lineTo(24.0f, 11.2f)
                lineTo(24.0f, 9.95f)
                horizontalLineToRelative(-4.85f)
                curveToRelative(-0.65f, 0.05f, -1.25f, 0.25f, -1.7f, 0.7f)
                curveToRelative(-0.4f, 0.4f, -0.65f, 1.1f, -0.7f, 1.75f)
                curveToRelative(0.0f, 0.35f, -0.05f, 0.85f, 0.0f, 1.15f)
                curveToRelative(0.05f, 0.75f, 0.3f, 1.3f, 0.7f, 1.7f)
                curveToRelative(0.4f, 0.45f, 1.05f, 0.7f, 1.7f, 0.7f)
                lineTo(24.0f, 15.95f)
                lineTo(24.0f, 14.7f)
                curveToRelative(0.0f, 0.05f, -1.3f, 0.05f, -2.0f, 0.05f)
                moveTo(8.5f, 10.0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-4.7f)
                horizontalLineToRelative(2.95f)
                lineTo(15.65f, 10.0f)
                close()
                moveTo(7.2f, 12.35f)
                curveToRelative(0.0f, -0.65f, -0.25f, -1.25f, -0.7f, -1.7f)
                curveToRelative(-0.5f, -0.5f, -1.2f, -0.7f, -1.7f, -0.7f)
                lineTo(2.35f, 9.95f)
                curveToRelative(-0.55f, 0.0f, -0.95f, 0.2f, -1.15f, 0.35f)
                lineTo(1.2f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.05f, -0.65f, 0.55f, -1.15f, 1.15f, -1.2f)
                curveToRelative(0.5f, -0.05f, 1.95f, -0.05f, 2.4f, 0.0f)
                curveToRelative(0.65f, 0.05f, 1.1f, 0.55f, 1.15f, 1.2f)
                lineTo(5.95f, 16.0f)
                lineTo(7.2f, 16.0f)
                close()
            }
        }
        .build()
        return _htc!!
    }

private var _htc: ImageVector? = null
