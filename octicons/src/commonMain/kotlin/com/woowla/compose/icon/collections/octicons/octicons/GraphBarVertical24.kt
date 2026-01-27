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

public val Octicons.GraphBarVertical24: ImageVector
    get() {
        if (_graphBarVertical24 != null) {
            return _graphBarVertical24!!
        }
        _graphBarVertical24 = Builder(name = "GraphBarVertical24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.875f, 22.875f)
                verticalLineTo(1.125f)
                quadToRelative(0.0f, -0.311f, 0.22f, -0.53f)
                quadToRelative(0.219f, -0.22f, 0.53f, -0.22f)
                quadToRelative(0.311f, 0.0f, 0.53f, 0.22f)
                quadToRelative(0.22f, 0.219f, 0.22f, 0.53f)
                verticalLineToRelative(21.75f)
                quadToRelative(0.0f, 0.311f, -0.22f, 0.53f)
                quadToRelative(-0.219f, 0.22f, -0.53f, 0.22f)
                quadToRelative(-0.311f, 0.0f, -0.53f, -0.22f)
                quadToRelative(-0.22f, -0.219f, -0.22f, -0.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 4.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-10.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 3.0f, 8.75f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
                moveTo(19.5f, 10.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(16.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
                moveTo(10.5f, 16.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _graphBarVertical24!!
    }

private var _graphBarVertical24: ImageVector? = null
