package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.Clipboard2HeartFill: ImageVector
    get() {
        if (_clipboard2HeartFill != null) {
            return _clipboard2HeartFill!!
        }
        _clipboard2HeartFill = Builder(name = "Clipboard2HeartFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.058f, 0.501f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.501f)
                horizontalLineToRelative(-2.98f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.501f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.582f, 1.0f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.497f, 0.497f)
                verticalLineTo(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.968f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-0.503f)
                arcTo(0.497f, 0.497f, 0.0f, false, false, 10.555f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.497f, -0.499f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.174f, 1.0f)
                horizontalLineToRelative(-0.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-0.642f)
                quadToRelative(0.084f, 0.236f, 0.085f, 0.5f)
                lineTo(12.047f, 2.0f)
                curveToRelative(0.0f, 0.828f, -0.668f, 1.5f, -1.492f, 1.5f)
                lineTo(5.581f, 3.5f)
                arcTo(1.496f, 1.496f, 0.0f, false, true, 4.09f, 2.0f)
                verticalLineToRelative(-0.5f)
                quadToRelative(0.001f, -0.264f, 0.085f, -0.5f)
                close()
                moveTo(8.068f, 6.482f)
                curveToRelative(1.656f, -1.673f, 5.795f, 1.254f, 0.0f, 5.018f)
                curveToRelative(-5.795f, -3.764f, -1.656f, -6.69f, 0.0f, -5.018f)
            }
        }
        .build()
        return _clipboard2HeartFill!!
    }

private var _clipboard2HeartFill: ImageVector? = null
