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

public val Twbs.TypeUnderline: ImageVector
    get() {
        if (_typeUnderline != null) {
            return _typeUnderline!!
        }
        _typeUnderline = Builder(name = "TypeUnderline", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.313f, 3.136f)
                horizontalLineToRelative(-1.23f)
                verticalLineTo(9.54f)
                curveToRelative(0.0f, 2.105f, 1.47f, 3.623f, 3.917f, 3.623f)
                reflectiveCurveToRelative(3.917f, -1.518f, 3.917f, -3.623f)
                verticalLineTo(3.136f)
                horizontalLineToRelative(-1.23f)
                verticalLineToRelative(6.323f)
                curveToRelative(0.0f, 1.49f, -0.978f, 2.57f, -2.687f, 2.57f)
                reflectiveCurveToRelative(-2.687f, -1.08f, -2.687f, -2.57f)
                close()
                moveTo(12.5f, 15.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _typeUnderline!!
    }

private var _typeUnderline: ImageVector? = null
