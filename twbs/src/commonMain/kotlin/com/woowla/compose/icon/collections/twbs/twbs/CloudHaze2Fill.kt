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

public val Twbs.CloudHaze2Fill: ImageVector
    get() {
        if (_cloudHaze2Fill != null) {
            return _cloudHaze2Fill!!
        }
        _cloudHaze2Fill = Builder(name = "CloudHaze2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.905f, 4.027f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 12.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.035f, 9.0f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(0.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.871f, -2.977f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.5f, 2.0f)
                moveToRelative(-6.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(0.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _cloudHaze2Fill!!
    }

private var _cloudHaze2Fill: ImageVector? = null
