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

public val Twbs.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.854f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, -0.708f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineTo(2.707f, 8.0f)
                close()
                moveTo(10.146f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.708f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineTo(13.293f, 8.0f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
