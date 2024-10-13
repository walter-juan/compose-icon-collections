package com.woowla.compose.icon.collections.devicons.devicons.angularjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AngularjsGroup

public val AngularjsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFC4473A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.86f, 64.0f)
                horizontalLineToRelative(23.28f)
                lineTo(63.77f, 38.12f)
                close()
                moveTo(63.81f, 1.03f)
                lineTo(4.55f, 21.88f)
                lineToRelative(9.36f, 77.64f)
                lineToRelative(49.96f, 27.46f)
                lineToRelative(50.21f, -27.83f)
                lineToRelative(9.36f, -77.64f)
                lineTo(63.81f, 1.03f)
                close()
                moveTo(48.04f, 75.0f)
                lineToRelative(-7.26f, 18.18f)
                lineToRelative(-13.58f, 0.06f)
                lineToRelative(36.61f, -81.08f)
                lineToRelative(-0.07f, -0.15f)
                horizontalLineToRelative(-0.06f)
                lineToRelative(0.0f, -0.13f)
                lineToRelative(0.06f, 0.13f)
                horizontalLineToRelative(0.14f)
                lineToRelative(0.12f, -0.27f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-0.12f)
                lineToRelative(-0.07f, 0.15f)
                lineToRelative(38.19f, 81.42f)
                lineToRelative(-13.07f, -0.29f)
                lineToRelative(-8.04f, -18.58f)
                lineToRelative(-17.17f, 0.08f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
