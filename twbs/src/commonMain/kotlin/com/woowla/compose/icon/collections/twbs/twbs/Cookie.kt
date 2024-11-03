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

public val Twbs.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(4.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(-0.5f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -4.075f, 1.114f)
                quadToRelative(-0.245f, 0.102f, -0.437f, 0.28f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                moveToRelative(3.25f, 14.201f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.13f, 0.71f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 15.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -3.845f, -1.15f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.005f, -2.005f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 1.0f, 8.0f)
                curveToRelative(0.0f, -1.953f, 0.8f, -3.719f, 2.09f, -4.989f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.469f, -1.574f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 1.0f)
                curveToRelative(1.42f, 0.0f, 2.742f, 0.423f, 3.845f, 1.15f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.005f, 2.005f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 15.0f, 8.0f)
                curveToRelative(0.0f, 0.596f, -0.074f, 1.174f, -0.214f, 1.727f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.025f, 2.25f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -2.51f, 2.224f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
