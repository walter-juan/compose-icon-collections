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

public val Twbs.SymmetryVertical: ImageVector
    get() {
        if (_symmetryVertical != null) {
            return _symmetryVertical!!
        }
        _symmetryVertical = Builder(name = "SymmetryVertical", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.939f, -0.24f)
                lineToRelative(-6.0f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.5f, 14.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(9.376f, 2.016f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.563f, 0.245f)
                lineToRelative(6.0f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 14.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.376f, -0.484f)
                moveTo(10.0f, 4.46f)
                lineTo(10.0f, 13.0f)
                horizontalLineToRelative(4.658f)
                close()
            }
        }
        .build()
        return _symmetryVertical!!
    }

private var _symmetryVertical: ImageVector? = null
