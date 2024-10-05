package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.TabExternal24: ImageVector
    get() {
        if (_tabExternal24 != null) {
            return _tabExternal24!!
        }
        _tabExternal24 = Builder(name = "TabExternal24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.784f, 3.784f, 4.0f, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineTo(18.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.65f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -0.85f, -0.85f)
                verticalLineTo(5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(13.4f)
                curveToRelative(0.0f, 0.47f, -0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineTo(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.404f, 13.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.29f, 0.547f)
                arcToRelative(689.448f, 689.448f, 0.0f, false, false, -1.92f, -1.976f)
                lineToRelative(-4.141f, 4.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.061f, -1.06f)
                lineToRelative(4.14f, -4.14f)
                lineToRelative(-1.94f, -1.94f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 10.703f, 8.0f)
                horizontalLineToRelative(4.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.95f)
                close()
            }
        }
        .build()
        return _tabExternal24!!
    }

private var _tabExternal24: ImageVector? = null
