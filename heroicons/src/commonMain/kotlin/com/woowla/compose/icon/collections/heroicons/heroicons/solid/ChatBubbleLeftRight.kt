package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ChatBubbleLeftRight: ImageVector
    get() {
        if (_chatBubbleLeftRight != null) {
            return _chatBubbleLeftRight!!
        }
        _chatBubbleLeftRight = Builder(name = "ChatBubbleLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.913f, 2.658f)
                curveTo(6.988f, 2.389f, 9.103f, 2.25f, 11.25f, 2.25f)
                curveTo(13.397f, 2.25f, 15.512f, 2.389f, 17.587f, 2.658f)
                curveTo(19.509f, 2.908f, 20.878f, 4.519f, 20.992f, 6.385f)
                curveTo(20.667f, 6.276f, 20.321f, 6.204f, 19.96f, 6.174f)
                curveTo(18.572f, 6.059f, 17.167f, 6.0f, 15.75f, 6.0f)
                curveTo(14.333f, 6.0f, 12.929f, 6.059f, 11.54f, 6.174f)
                curveTo(9.182f, 6.37f, 7.5f, 8.365f, 7.5f, 10.608f)
                verticalLineTo(14.894f)
                curveTo(7.5f, 16.584f, 8.455f, 18.133f, 9.933f, 18.878f)
                lineTo(7.28f, 21.53f)
                curveTo(7.066f, 21.745f, 6.743f, 21.809f, 6.463f, 21.693f)
                curveTo(6.183f, 21.577f, 6.0f, 21.303f, 6.0f, 21.0f)
                verticalLineTo(16.971f)
                curveTo(5.636f, 16.932f, 5.274f, 16.889f, 4.913f, 16.842f)
                curveTo(2.905f, 16.581f, 1.5f, 14.833f, 1.5f, 12.863f)
                verticalLineTo(6.637f)
                curveTo(1.5f, 4.667f, 2.905f, 2.919f, 4.913f, 2.658f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 7.5f)
                curveTo(14.374f, 7.5f, 13.011f, 7.557f, 11.664f, 7.669f)
                curveTo(10.125f, 7.797f, 9.0f, 9.103f, 9.0f, 10.608f)
                verticalLineTo(14.894f)
                curveTo(9.0f, 16.401f, 10.128f, 17.708f, 11.669f, 17.834f)
                curveTo(12.913f, 17.936f, 14.17f, 17.991f, 15.438f, 17.999f)
                lineTo(18.22f, 20.78f)
                curveTo(18.434f, 20.995f, 18.757f, 21.059f, 19.037f, 20.943f)
                curveTo(19.317f, 20.827f, 19.5f, 20.553f, 19.5f, 20.25f)
                verticalLineTo(17.86f)
                curveTo(19.61f, 17.852f, 19.721f, 17.843f, 19.831f, 17.834f)
                curveTo(21.372f, 17.708f, 22.5f, 16.402f, 22.5f, 14.894f)
                verticalLineTo(10.608f)
                curveTo(22.5f, 9.103f, 21.375f, 7.797f, 19.836f, 7.669f)
                curveTo(18.489f, 7.557f, 17.126f, 7.5f, 15.75f, 7.5f)
                close()
            }
        }
        .build()
        return _chatBubbleLeftRight!!
    }

private var _chatBubbleLeftRight: ImageVector? = null
