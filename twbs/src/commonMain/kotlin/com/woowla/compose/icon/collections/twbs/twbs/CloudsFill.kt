package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudsFill: ImageVector
    get() {
        if (_cloudsFill != null) {
            return _cloudsFill!!
        }
        _cloudsFill = Builder(name = "CloudsFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.473f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.72f, -0.99f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 14.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.027f, -5.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.544f, 9.772f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.225f, -1.676f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -6.337f, -4.002f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 7.392f, 0.91f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.17f, 4.769f)
                close()
            }
        }
        .build()
        return _cloudsFill!!
    }

private var _cloudsFill: ImageVector? = null
