package com.woowla.compose.icon.collections.devicons.devicons.terraform

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TerraformGroup

public val TerraformGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.32f, 26.08f)
                lineTo(77.94f, 44.5f)
                verticalLineToRelative(36.84f)
                lineTo(46.32f, 62.92f)
                close()
                moveTo(46.32f, 26.08f)
                moveTo(81.41f, 44.5f)
                verticalLineToRelative(36.84f)
                lineToRelative(31.63f, -18.42f)
                lineTo(113.04f, 26.08f)
                close()
                moveTo(81.41f, 44.5f)
                moveTo(11.24f, 5.52f)
                lineTo(11.24f, 42.36f)
                lineTo(42.86f, 60.78f)
                lineTo(42.86f, 23.94f)
                close()
                moveTo(11.24f, 5.52f)
                moveTo(77.94f, 85.38f)
                lineTo(46.32f, 66.96f)
                verticalLineToRelative(36.82f)
                lineTo(77.94f, 122.2f)
                close()
                moveTo(77.94f, 85.38f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
