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

public val Twbs.Amd: ImageVector
    get() {
        if (_amd != null) {
            return _amd!!
        }
        _amd = Builder(name = "Amd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.334f, 0.0f)
                lineToRelative(4.358f, 4.359f)
                horizontalLineToRelative(7.15f)
                verticalLineToRelative(7.15f)
                lineToRelative(4.358f, 4.358f)
                verticalLineTo(0.0f)
                close()
                moveTo(0.2f, 9.72f)
                lineToRelative(4.487f, -4.488f)
                verticalLineToRelative(6.281f)
                horizontalLineToRelative(6.28f)
                lineTo(6.48f, 16.0f)
                horizontalLineTo(0.2f)
                close()
            }
        }
        .build()
        return _amd!!
    }

private var _amd: ImageVector? = null
