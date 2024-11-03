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

public val Twbs.BoxSeamFill: ImageVector
    get() {
        if (_boxSeamFill != null) {
            return _boxSeamFill!!
        }
        _boxSeamFill = Builder(name = "BoxSeamFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.528f, 2.973f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.472f, 0.696f)
                verticalLineToRelative(8.662f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.472f, 0.696f)
                lineToRelative(-7.25f, 2.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 0.0f)
                lineToRelative(-7.25f, -2.9f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.0f, 12.331f)
                verticalLineTo(3.669f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.471f, -0.696f)
                lineTo(7.443f, 0.184f)
                lineToRelative(0.01f, -0.003f)
                lineToRelative(0.268f, -0.108f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.558f, 0.0f)
                lineToRelative(0.269f, 0.108f)
                lineToRelative(0.01f, 0.003f)
                close()
                moveTo(10.404f, 2.0f)
                lineTo(4.25f, 4.461f)
                lineTo(1.846f, 3.5f)
                lineTo(1.0f, 3.839f)
                verticalLineToRelative(0.4f)
                lineToRelative(6.5f, 2.6f)
                verticalLineToRelative(7.922f)
                lineToRelative(0.5f, 0.2f)
                lineToRelative(0.5f, -0.2f)
                verticalLineTo(6.84f)
                lineToRelative(6.5f, -2.6f)
                verticalLineToRelative(-0.4f)
                lineToRelative(-0.846f, -0.339f)
                lineTo(8.0f, 5.961f)
                lineTo(5.596f, 5.0f)
                lineToRelative(6.154f, -2.461f)
                close()
            }
        }
        .build()
        return _boxSeamFill!!
    }

private var _boxSeamFill: ImageVector? = null
