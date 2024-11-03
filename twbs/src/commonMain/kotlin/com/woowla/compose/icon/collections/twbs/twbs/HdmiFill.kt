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

public val Twbs.HdmiFill: ImageVector
    get() {
        if (_hdmiFill != null) {
            return _hdmiFill!!
        }
        _hdmiFill = Builder(name = "HdmiFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.293f)
                curveToRelative(0.0f, 0.39f, 0.317f, 0.707f, 0.707f, 0.707f)
                curveToRelative(0.188f, 0.0f, 0.368f, 0.075f, 0.5f, 0.207f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(11.172f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.5f, -0.207f)
                curveToRelative(0.39f, 0.0f, 0.707f, -0.317f, 0.707f, -0.707f)
                lineTo(16.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(2.5f, 7.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
            }
        }
        .build()
        return _hdmiFill!!
    }

private var _hdmiFill: ImageVector? = null
