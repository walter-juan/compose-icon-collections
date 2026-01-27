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

public val Octicons.GraphBarVertical16: ImageVector
    get() {
        if (_graphBarVertical16 != null) {
            return _graphBarVertical16!!
        }
        _graphBarVertical16 = Builder(name = "GraphBarVertical16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 15.25f)
                verticalLineTo(0.75f)
                quadToRelative(0.0f, -0.311f, 0.22f, -0.53f)
                quadToRelative(0.219f, -0.22f, 0.53f, -0.22f)
                quadToRelative(0.311f, 0.0f, 0.53f, 0.22f)
                quadToRelative(0.22f, 0.219f, 0.22f, 0.53f)
                verticalLineToRelative(14.5f)
                quadToRelative(0.0f, 0.311f, -0.22f, 0.53f)
                quadToRelative(-0.219f, 0.22f, -0.53f, 0.22f)
                quadToRelative(-0.311f, 0.0f, -0.53f, -0.22f)
                quadToRelative(-0.22f, -0.219f, -0.22f, -0.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.25f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-6.5f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.0f, 5.75f)
                verticalLineToRelative(-2.5f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.25f, 3.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
                moveTo(13.0f, 7.25f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(2.25f, 10.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.0f, 9.75f)
                verticalLineToRelative(-2.5f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.25f, 7.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
                moveTo(7.0f, 11.25f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _graphBarVertical16!!
    }

private var _graphBarVertical16: ImageVector? = null
