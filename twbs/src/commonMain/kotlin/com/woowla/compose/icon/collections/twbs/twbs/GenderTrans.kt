package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GenderTrans: ImageVector
    get() {
        if (_genderTrans != null) {
            return _genderTrans!!
        }
        _genderTrans = Builder(name = "GenderTrans", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(1.707f, 1.0f)
                lineTo(3.5f, 2.793f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.822f, 0.822f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 3.0f)
                curveToRelative(1.18f, 0.0f, 2.239f, 0.51f, 2.971f, 1.322f)
                lineTo(14.293f, 1.0f)
                lineTo(11.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(15.0f, 1.707f)
                lineToRelative(-3.45f, 3.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.5f, 10.97f)
                lineTo(8.5f, 13.0f)
                lineTo(10.0f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(8.5f, 14.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(7.5f, 14.0f)
                lineTo(6.0f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.05f, -5.814f)
                lineToRelative(-0.95f, -0.949f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineTo(1.0f, 1.707f)
                lineTo(1.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                close()
                moveTo(5.49f, 5.356f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 5.02f, 3.288f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.02f, -3.288f)
            }
        }
        .build()
        return _genderTrans!!
    }

private var _genderTrans: ImageVector? = null
