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

public val Simpleicons.Windsurf: ImageVector
    get() {
        if (_windsurf != null) {
            return _windsurf!!
        }
        _windsurf = Builder(name = "Windsurf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.55f, 5.067f)
                curveToRelative(-1.204f, -0.002f, -2.181f, 0.973f, -2.181f, 2.177f)
                verticalLineToRelative(4.868f)
                curveToRelative(0.0f, 0.972f, -0.803f, 1.759f, -1.76f, 1.759f)
                curveToRelative(-0.568f, 0.0f, -1.135f, -0.286f, -1.472f, -0.766f)
                lineToRelative(-4.971f, -7.1f)
                curveToRelative(-0.412f, -0.59f, -1.084f, -0.941f, -1.81f, -0.941f)
                curveToRelative(-1.133f, 0.0f, -2.153f, 0.964f, -2.153f, 2.153f)
                verticalLineToRelative(4.896f)
                curveToRelative(0.0f, 0.972f, -0.797f, 1.759f, -1.76f, 1.759f)
                curveToRelative(-0.57f, 0.0f, -1.136f, -0.286f, -1.473f, -0.766f)
                lineTo(0.408f, 5.16f)
                curveTo(0.282f, 4.98f, 0.0f, 5.069f, 0.0f, 5.288f)
                verticalLineToRelative(4.245f)
                curveToRelative(0.0f, 0.215f, 0.066f, 0.423f, 0.188f, 0.599f)
                lineToRelative(5.475f, 7.818f)
                curveToRelative(0.323f, 0.462f, 0.801f, 0.805f, 1.351f, 0.93f)
                curveToRelative(1.377f, 0.313f, 2.645f, -0.747f, 2.645f, -2.098f)
                verticalLineToRelative(-4.893f)
                curveToRelative(0.0f, -0.972f, 0.788f, -1.759f, 1.76f, -1.759f)
                horizontalLineToRelative(0.003f)
                arcToRelative(1.798f, 1.798f, 0.0f, false, true, 1.472f, 0.766f)
                lineToRelative(4.972f, 7.099f)
                curveToRelative(0.414f, 0.59f, 1.05f, 0.941f, 1.809f, 0.941f)
                curveToRelative(1.159f, 0.0f, 2.151f, -0.965f, 2.151f, -2.153f)
                verticalLineToRelative(-4.895f)
                curveToRelative(0.0f, -0.972f, 0.788f, -1.759f, 1.76f, -1.759f)
                horizontalLineToRelative(0.194f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.22f, -0.22f)
                verticalLineToRelative(-4.622f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, -0.22f, -0.22f)
                close()
            }
        }
        .build()
        return _windsurf!!
    }

private var _windsurf: ImageVector? = null
