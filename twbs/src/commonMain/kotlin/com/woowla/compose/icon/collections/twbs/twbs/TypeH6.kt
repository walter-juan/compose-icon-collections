package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TypeH6: ImageVector
    get() {
        if (_typeH6 != null) {
            return _typeH6!!
        }
        _typeH6 = Builder(name = "TypeH6", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.596f, 5.178f)
                horizontalLineTo(14.3f)
                curveToRelative(-0.106f, -0.444f, -0.62f, -1.072f, -1.706f, -1.072f)
                curveToRelative(-1.332f, 0.0f, -2.325f, 1.269f, -2.325f, 3.947f)
                horizontalLineToRelative(0.07f)
                curveToRelative(0.268f, -0.67f, 1.043f, -1.445f, 2.445f, -1.445f)
                curveToRelative(1.494f, 0.0f, 3.017f, 1.064f, 3.017f, 3.073f)
                curveTo(15.8f, 11.795f, 14.37f, 13.0f, 12.48f, 13.0f)
                curveToRelative(-1.036f, 0.0f, -2.093f, -0.36f, -2.77f, -1.452f)
                curveTo(9.276f, 10.836f, 9.0f, 9.808f, 9.0f, 8.37f)
                curveTo(9.0f, 4.656f, 10.494f, 3.0f, 12.636f, 3.0f)
                curveToRelative(1.812f, 0.0f, 2.883f, 1.113f, 2.96f, 2.178f)
                moveToRelative(-5.151f, 4.566f)
                curveToRelative(0.0f, 1.367f, 0.944f, 2.15f, 2.043f, 2.15f)
                curveToRelative(1.128f, 0.0f, 2.037f, -0.684f, 2.037f, -2.136f)
                curveToRelative(0.0f, -1.41f, -1.0f, -2.065f, -2.03f, -2.065f)
                curveToRelative(-1.19f, 0.0f, -2.05f, 0.853f, -2.05f, 2.051f)
                moveTo(7.495f, 13.0f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.513f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _typeH6!!
    }

private var _typeH6: ImageVector? = null
