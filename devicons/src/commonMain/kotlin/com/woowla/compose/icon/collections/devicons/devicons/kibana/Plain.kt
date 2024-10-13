package com.woowla.compose.icon.collections.devicons.devicons.kibana

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.KibanaGroup

public val KibanaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF04E98)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(2.32f, 0.0f, 4.62f, 0.09f, 6.91f, 0.24f)
                arcTo(99.42f, 99.42f, 0.0f, false, false, 12.0f, 48.0f)
                verticalLineToRelative(67.15f)
                lineToRelative(47.73f, -54.96f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, -6.1f, -3.06f)
                arcToRelative(101.03f, 101.03f, 0.0f, false, true, 6.1f, 3.05f)
                lineTo(112.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(19.44f, 48.29f)
                arcToRelative(99.33f, 99.33f, 0.0f, false, true, 6.47f, 0.69f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, -6.47f, -0.69f)
                close()
                moveTo(26.47f, 49.06f)
                curveToRelative(2.19f, 0.32f, 4.36f, 0.71f, 6.5f, 1.17f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, -6.5f, -1.17f)
                close()
                moveTo(33.31f, 50.31f)
                arcToRelative(99.24f, 99.24f, 0.0f, false, true, 13.23f, 3.88f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, -13.23f, -3.88f)
                close()
                moveTo(47.16f, 54.43f)
                curveToRelative(1.98f, 0.75f, 3.93f, 1.56f, 5.86f, 2.43f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, -5.86f, -2.43f)
                close()
                moveTo(70.04f, 66.62f)
                lineToRelative(-48.97f, 56.41f)
                lineTo(16.74f, 128.0f)
                horizontalLineToRelative(93.26f)
                curveToRelative(-5.12f, -25.21f, -19.76f, -46.94f, -39.96f, -61.38f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
