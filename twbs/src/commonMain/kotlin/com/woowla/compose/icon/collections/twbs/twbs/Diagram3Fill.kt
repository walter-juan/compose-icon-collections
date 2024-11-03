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

public val Twbs.Diagram3Fill: ImageVector
    get() {
        if (_diagram3Fill != null) {
            return _diagram3Fill!!
        }
        _diagram3Fill = Builder(name = "Diagram3Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 3.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(14.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(13.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(7.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 7.0f)
                horizontalLineToRelative(5.5f)
                lineTo(7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 4.5f)
                close()
                moveTo(0.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 10.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 11.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 14.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 12.5f)
                close()
                moveTo(6.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 10.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 14.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 12.5f)
                close()
                moveTo(12.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _diagram3Fill!!
    }

private var _diagram3Fill: ImageVector? = null
