package com.woowla.compose.icon.collections.devicons.devicons.markdown

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
import com.woowla.compose.icon.collections.devicons.devicons.MarkdownGroup

public val MarkdownGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 24.35f)
                curveToRelative(-5.84f, 0.0f, -10.62f, 4.87f, -10.62f, 10.68f)
                verticalLineToRelative(57.94f)
                curveToRelative(0.0f, 5.81f, 4.78f, 10.68f, 10.62f, 10.68f)
                horizontalLineToRelative(104.1f)
                curveToRelative(5.84f, 0.0f, 10.62f, -4.87f, 10.62f, -10.68f)
                lineTo(126.67f, 35.03f)
                curveToRelative(0.0f, -5.81f, -4.78f, -10.68f, -10.62f, -10.68f)
                lineTo(14.9f, 24.35f)
                lineToRelative(-0.0f, -0.0f)
                lineTo(11.95f, 24.35f)
                close()
                moveTo(11.94f, 33.89f)
                horizontalLineToRelative(104.11f)
                curveToRelative(0.63f, 0.0f, 1.08f, 0.42f, 1.08f, 1.14f)
                verticalLineToRelative(57.94f)
                curveToRelative(0.0f, 0.72f, -0.45f, 1.14f, -1.08f, 1.14f)
                lineTo(11.95f, 94.11f)
                curveToRelative(-0.62f, 0.0f, -1.08f, -0.42f, -1.08f, -1.14f)
                lineTo(10.87f, 35.03f)
                curveToRelative(0.0f, -0.71f, 0.45f, -1.13f, 1.07f, -1.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.72f, 84.1f)
                lineTo(20.72f, 43.9f)
                lineTo(32.42f, 43.9f)
                lineToRelative(11.7f, 14.78f)
                lineTo(55.81f, 43.9f)
                horizontalLineToRelative(11.7f)
                verticalLineToRelative(40.2f)
                lineTo(55.81f, 84.1f)
                lineTo(55.81f, 61.04f)
                lineToRelative(-11.69f, 14.78f)
                lineToRelative(-11.7f, -14.78f)
                lineTo(32.42f, 84.1f)
                lineTo(20.72f, 84.1f)
                close()
                moveTo(93.82f, 84.1f)
                lineTo(76.28f, 64.59f)
                horizontalLineToRelative(11.7f)
                lineTo(87.98f, 43.9f)
                horizontalLineToRelative(11.7f)
                verticalLineToRelative(20.69f)
                horizontalLineToRelative(11.7f)
                close()
                moveTo(93.82f, 84.1f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
