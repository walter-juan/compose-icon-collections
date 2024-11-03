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

public val Twbs.FiletypeTtf: ImageVector
    get() {
        if (_filetypeTtf != null) {
            return _filetypeTtf!!
        }
        _filetypeTtf = Builder(name = "FiletypeTtf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(1.928f, 15.849f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(2.269f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(0.794f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(1.137f)
                verticalLineToRelative(-0.662f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(0.662f)
                horizontalLineToRelative(1.134f)
                verticalLineToRelative(3.337f)
                close()
                moveTo(7.243f, 14.259f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-0.791f)
                lineTo(6.452f, 11.85f)
                lineTo(9.0f, 11.85f)
                verticalLineToRelative(0.653f)
                lineTo(7.243f, 12.503f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(0.638f)
                close()
            }
        }
        .build()
        return _filetypeTtf!!
    }

private var _filetypeTtf: ImageVector? = null
