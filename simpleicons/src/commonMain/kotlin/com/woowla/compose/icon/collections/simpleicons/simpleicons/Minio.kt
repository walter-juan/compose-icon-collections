package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Minio: ImageVector
    get() {
        if (_minio != null) {
            return _minio!!
        }
        _minio = Builder(name = "Minio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.207f, 0.006f)
                curveToRelative(-0.622f, -0.048f, -1.2f, 0.194f, -1.621f, 0.582f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, -0.094f, 3.035f)
                lineToRelative(3.408f, 3.551f)
                arcToRelative(3.042f, 3.042f, 0.0f, false, true, -0.664f, 4.688f)
                lineToRelative(-0.463f, 0.238f)
                lineTo(13.774f, 7.285f)
                arcToRelative(15.42f, 15.42f, 0.0f, false, false, -8.017f, 10.486f)
                verticalLineToRelative(0.018f)
                lineToRelative(6.549f, -3.328f)
                verticalLineToRelative(7.621f)
                lineTo(13.779f, 24.0f)
                lineTo(13.779f, 13.682f)
                lineToRelative(0.896f, -0.463f)
                arcToRelative(4.443f, 4.443f, 0.0f, false, false, 1.221f, -7.029f)
                lineToRelative(-3.371f, -3.525f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.037f, -1.055f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 1.057f, 0.037f)
                lineToRelative(0.467f, 0.486f)
                lineToRelative(-0.006f, 0.006f)
                lineToRelative(4.07f, 4.244f)
                arcToRelative(0.057f, 0.057f, 0.0f, false, false, 0.082f, 0.0f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, 0.0f, -0.07f)
                lineToRelative(-3.141f, -5.142f)
                lineToRelative(-0.148f, 0.142f)
                lineToRelative(0.148f, -0.145f)
                curveTo(14.495f, 0.393f, 13.829f, 0.054f, 13.207f, 0.006f)
                close()
                moveTo(12.305f, 9.871f)
                verticalLineToRelative(2.994f)
                lineToRelative(-4.152f, 2.148f)
                arcToRelative(13.979f, 13.979f, 0.0f, false, true, 2.768f, -3.928f)
                arcToRelative(14.178f, 14.178f, 0.0f, false, true, 1.385f, -1.215f)
                close()
            }
        }
        .build()
        return _minio!!
    }

private var _minio: ImageVector? = null
