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

public val Octicons.GraphBarHorizontal16: ImageVector
    get() {
        if (_graphBarHorizontal16 != null) {
            return _graphBarHorizontal16!!
        }
        _graphBarHorizontal16 = Builder(name = "GraphBarHorizontal16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 15.0f)
                horizontalLineTo(0.75f)
                quadToRelative(-0.311f, 0.0f, -0.53f, -0.22f)
                quadToRelative(-0.22f, -0.219f, -0.22f, -0.53f)
                quadToRelative(0.0f, -0.311f, 0.22f, -0.53f)
                quadToRelative(0.219f, -0.22f, 0.53f, -0.22f)
                horizontalLineToRelative(14.5f)
                quadToRelative(0.311f, 0.0f, 0.53f, 0.22f)
                quadToRelative(0.22f, 0.219f, 0.22f, 0.53f)
                quadToRelative(0.0f, 0.311f, -0.22f, 0.53f)
                quadToRelative(-0.219f, 0.22f, -0.53f, 0.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 7.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-6.5f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.25f, 7.0f)
                close()
                moveTo(6.25f, 3.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(6.0f, 3.25f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 6.25f, 3.0f)
                close()
                moveTo(10.25f, 9.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _graphBarHorizontal16!!
    }

private var _graphBarHorizontal16: ImageVector? = null
