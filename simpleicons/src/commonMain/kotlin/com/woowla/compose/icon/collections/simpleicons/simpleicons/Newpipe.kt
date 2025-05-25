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

public val Simpleicons.Newpipe: ImageVector
    get() {
        if (_newpipe != null) {
            return _newpipe!!
        }
        _newpipe = Builder(name = "Newpipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.988f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.012f, 0.0f)
                close()
                moveTo(7.608f, 4.608f)
                reflectiveCurveToRelative(1.512f, 0.888f, 3.672f, 2.16f)
                curveTo(13.848f, 8.28f, 17.304f, 10.32f, 20.16f, 12.0f)
                arcToRelative(5976.548f, 5976.548f, 0.0f, false, false, -8.736f, 5.16f)
                verticalLineToRelative(-2.675f)
                curveToRelative(1.07f, -0.63f, 2.467f, -1.455f, 4.224f, -2.485f)
                curveToRelative(-1.296f, -0.768f, -2.856f, -1.703f, -4.032f, -2.375f)
                lineToRelative(-1.68f, -0.985f)
                verticalLineToRelative(9.399f)
                lineToRelative(-2.328f, 1.377f)
                close()
            }
        }
        .build()
        return _newpipe!!
    }

private var _newpipe: ImageVector? = null
