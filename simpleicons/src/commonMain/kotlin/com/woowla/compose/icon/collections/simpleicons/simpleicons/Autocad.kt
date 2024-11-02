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

public val Simpleicons.Autocad: ImageVector
    get() {
        if (_autocad != null) {
            return _autocad!!
        }
        _autocad = Builder(name = "Autocad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.867f, 1.053f)
                verticalLineToRelative(0.016f)
                lineTo(0.0f, 3.385f)
                verticalLineToRelative(17.914f)
                lineToRelative(3.897f, -2.332f)
                horizontalLineToRelative(18.34f)
                lineTo(22.236f, 2.33f)
                curveToRelative(0.0f, -0.702f, -0.577f, -1.277f, -1.279f, -1.277f)
                lineTo(3.867f, 1.053f)
                close()
                moveTo(11.373f, 5.063f)
                horizontalLineToRelative(3.301f)
                lineToRelative(2.984f, 9.951f)
                horizontalLineToRelative(-2.588f)
                lineToRelative(-0.568f, -2.19f)
                horizontalLineToRelative(-2.984f)
                lineToRelative(-0.57f, 2.162f)
                horizontalLineToRelative(-2.416f)
                lineToRelative(2.842f, -9.924f)
                close()
                moveTo(23.236f, 5.09f)
                verticalLineToRelative(14.877f)
                lineTo(4.172f, 19.967f)
                lineToRelative(-2.068f, 1.238f)
                verticalLineToRelative(0.465f)
                curveToRelative(0.0f, 0.702f, 0.579f, 1.277f, 1.281f, 1.277f)
                lineTo(24.0f, 22.947f)
                lineTo(24.0f, 5.09f)
                horizontalLineToRelative(-0.764f)
                close()
                moveTo(12.967f, 6.682f)
                lineToRelative(-0.994f, 4.324f)
                horizontalLineToRelative(2.047f)
                lineToRelative(-1.053f, -4.324f)
                close()
            }
        }
        .build()
        return _autocad!!
    }

private var _autocad: ImageVector? = null
