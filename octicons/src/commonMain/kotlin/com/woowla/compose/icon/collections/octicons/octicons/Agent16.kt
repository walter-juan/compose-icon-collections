package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Agent16: ImageVector
    get() {
        if (_agent16 != null) {
            return _agent16!!
        }
        _agent16 = Builder(name = "Agent16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 8.9f)
                verticalLineToRelative(-0.052f)
                arcTo(2.956f, 2.956f, 0.0f, false, false, 11.542f, 5.9f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, true, -0.751f, -0.501f)
                lineToRelative(-0.145f, -0.348f)
                arcTo(3.496f, 3.496f, 0.0f, false, false, 7.421f, 2.9f)
                horizontalLineToRelative(-0.206f)
                arcToRelative(3.754f, 3.754f, 0.0f, false, false, -3.736f, 4.118f)
                lineToRelative(0.011f, 0.121f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, true, -0.619f, 0.879f)
                arcTo(1.81f, 1.81f, 0.0f, false, false, 1.5f, 9.773f)
                verticalLineToRelative(0.14f)
                curveToRelative(0.0f, 1.097f, 0.89f, 1.987f, 1.987f, 1.987f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(3.487f)
                arcTo(3.487f, 3.487f, 0.0f, false, true, 0.0f, 9.913f)
                verticalLineToRelative(-0.14f)
                curveTo(0.0f, 8.449f, 0.785f, 7.274f, 1.963f, 6.75f)
                arcTo(5.253f, 5.253f, 0.0f, false, true, 7.215f, 1.4f)
                horizontalLineToRelative(0.206f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, 4.586f, 3.024f)
                arcTo(4.455f, 4.455f, 0.0f, false, true, 16.0f, 8.848f)
                verticalLineTo(8.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.38f, 7.67f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.061f)
                lineTo(8.38f, 13.23f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.719f, -1.72f)
                lineTo(7.32f, 8.731f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.38f, 7.67f)
                close()
                moveTo(15.0f, 13.45f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
        }
        .build()
        return _agent16!!
    }

private var _agent16: ImageVector? = null
