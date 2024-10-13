package com.woowla.compose.icon.collections.devicons.devicons.haxe

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
import com.woowla.compose.icon.collections.devicons.devicons.HaxeGroup

public val HaxeGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF6B214)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7f, 64.0f)
                lineToRelative(48.4f, -48.4f)
                lineTo(0.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF17321)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 15.7f)
                lineToRelative(48.4f, 48.4f)
                lineTo(128.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEF5E21)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.3f, 64.0f)
                lineToRelative(-48.4f, 48.4f)
                lineTo(128.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6B214)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 112.3f)
                lineTo(15.6f, 63.9f)
                lineTo(0.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA8220)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 63.9f)
                lineTo(64.0f, 15.7f)
                lineTo(112.3f, 64.0f)
                lineTo(64.0f, 112.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF8EF23)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 63.9f)
                lineTo(0.0f, 32.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(0.0f, 128.0f)
                verticalLineTo(96.0f)
                lineToRelative(15.6f, -32.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF8C713)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                lineToRelative(32.0f, 15.7f)
                close()
                moveTo(128.0f, 0.0f)
                lineTo(64.0f, 15.7f)
                lineTo(96.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEC4822)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.3f, 64.0f)
                lineTo(128.0f, 0.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(128.0f, 128.0f)
                verticalLineTo(96.0f)
                lineToRelative(-15.7f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEF5E21)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 128.0f)
                lineToRelative(64.0f, -15.7f)
                lineTo(32.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA8220)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                horizontalLineTo(96.0f)
                lineToRelative(-32.0f, -15.7f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
