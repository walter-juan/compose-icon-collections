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

public val Simpleicons.Googletv: ImageVector
    get() {
        if (_googletv != null) {
            return _googletv!!
        }
        _googletv = Builder(name = "Googletv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.11f, 3.245f)
                arcTo(3.117f, 3.117f, 0.0f, false, false, 0.0f, 6.355f)
                lineTo(0.0f, 13.7f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, 1.878f, 1.878f)
                horizontalLineToRelative(2.588f)
                lineTo(4.466f, 5.124f)
                curveToRelative(0.0f, -0.73f, 0.313f, -1.399f, 0.814f, -1.879f)
                close()
                moveTo(7.054f, 3.245f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -1.879f, 1.879f)
                lineTo(5.175f, 7.71f)
                horizontalLineToRelative(16.947f)
                verticalLineToRelative(0.021f)
                curveToRelative(0.73f, 0.0f, 1.398f, 0.313f, 1.878f, 0.814f)
                verticalLineToRelative(-2.19f)
                arcToRelative(3.117f, 3.117f, 0.0f, false, false, -3.11f, -3.11f)
                close()
                moveTo(19.534f, 8.421f)
                verticalLineToRelative(10.455f)
                curveToRelative(0.0f, 0.73f, -0.313f, 1.399f, -0.814f, 1.879f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.117f, 3.117f, 0.0f, false, false, 3.11f, -3.11f)
                lineTo(24.0f, 10.3f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -1.878f, -1.878f)
                close()
                moveTo(0.0f, 15.475f)
                verticalLineToRelative(2.17f)
                arcToRelative(3.117f, 3.117f, 0.0f, false, false, 3.11f, 3.11f)
                horizontalLineToRelative(13.836f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, 1.878f, -1.879f)
                lineTo(18.824f, 16.29f)
                lineTo(1.878f, 16.29f)
                curveToRelative(-0.73f, 0.0f, -1.398f, -0.314f, -1.878f, -0.814f)
            }
        }
        .build()
        return _googletv!!
    }

private var _googletv: ImageVector? = null
