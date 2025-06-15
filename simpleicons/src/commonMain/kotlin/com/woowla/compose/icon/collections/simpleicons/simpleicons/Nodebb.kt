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

public val Simpleicons.Nodebb: ImageVector
    get() {
        if (_nodebb != null) {
            return _nodebb!!
        }
        _nodebb = Builder(name = "Nodebb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.908f, 4.263f)
                curveToRelative(-3.439f, 0.0f, -5.4f, 1.68f, -5.4f, 4.156f)
                curveToRelative(0.0f, 1.525f, 0.793f, 2.763f, 2.093f, 3.316f)
                curveTo(1.014f, 12.265f, 0.0f, 13.569f, 0.0f, 15.36f)
                curveToRelative(0.0f, 2.675f, 1.984f, 4.377f, 5.6f, 4.377f)
                horizontalLineToRelative(6.053f)
                curveToRelative(0.0f, -1.269f, 0.03f, -2.557f, 0.031f, -4.44f)
                lineTo(11.684f, 4.263f)
                close()
                moveTo(12.316f, 4.263f)
                verticalLineToRelative(11.034f)
                curveToRelative(0.001f, 1.883f, 0.031f, 3.171f, 0.031f, 4.44f)
                lineTo(18.4f, 19.737f)
                curveToRelative(3.616f, 0.0f, 5.6f, -1.702f, 5.6f, -4.377f)
                curveToRelative(0.0f, -1.79f, -1.014f, -3.095f, -2.601f, -3.625f)
                curveToRelative(1.3f, -0.553f, 2.094f, -1.79f, 2.094f, -3.316f)
                curveToRelative(0.0f, -2.476f, -1.962f, -4.156f, -5.401f, -4.156f)
                close()
                moveTo(6.085f, 6.74f)
                horizontalLineToRelative(2.513f)
                verticalLineToRelative(3.935f)
                lineTo(6.085f, 10.675f)
                curveToRelative(-1.61f, 0.0f, -2.447f, -0.73f, -2.447f, -1.968f)
                reflectiveCurveTo(4.475f, 6.74f, 6.085f, 6.74f)
                close()
                moveTo(15.402f, 6.74f)
                horizontalLineToRelative(2.513f)
                curveToRelative(1.61f, 0.0f, 2.447f, 0.73f, 2.447f, 1.967f)
                curveToRelative(0.0f, 1.238f, -0.837f, 1.968f, -2.447f, 1.968f)
                horizontalLineToRelative(-2.513f)
                close()
                moveTo(5.842f, 13.106f)
                horizontalLineToRelative(2.734f)
                verticalLineToRelative(1.923f)
                curveToRelative(0.0f, 1.68f, -0.375f, 2.233f, -1.521f, 2.233f)
                lineTo(5.622f, 17.262f)
                curveToRelative(-1.654f, 0.0f, -2.492f, -0.707f, -2.492f, -2.122f)
                curveToRelative(0.0f, -1.348f, 0.904f, -2.034f, 2.712f, -2.034f)
                close()
                moveTo(15.424f, 13.106f)
                horizontalLineToRelative(2.734f)
                curveToRelative(1.808f, 0.0f, 2.712f, 0.686f, 2.712f, 2.034f)
                curveToRelative(0.0f, 1.415f, -0.838f, 2.122f, -2.492f, 2.122f)
                horizontalLineToRelative(-1.433f)
                curveToRelative(-1.146f, 0.0f, -1.52f, -0.553f, -1.52f, -2.233f)
                close()
            }
        }
        .build()
        return _nodebb!!
    }

private var _nodebb: ImageVector? = null
