package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 6.0f)
                curveTo(7.5f, 3.515f, 9.515f, 1.5f, 12.0f, 1.5f)
                curveTo(14.485f, 1.5f, 16.5f, 3.515f, 16.5f, 6.0f)
                curveTo(16.5f, 8.485f, 14.485f, 10.5f, 12.0f, 10.5f)
                curveTo(9.515f, 10.5f, 7.5f, 8.485f, 7.5f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.751f, 20.105f)
                curveTo(3.829f, 15.616f, 7.492f, 12.0f, 12.0f, 12.0f)
                curveTo(16.508f, 12.0f, 20.172f, 15.616f, 20.249f, 20.106f)
                curveTo(20.254f, 20.403f, 20.082f, 20.676f, 19.812f, 20.8f)
                curveTo(17.433f, 21.892f, 14.786f, 22.5f, 12.0f, 22.5f)
                curveTo(9.214f, 22.5f, 6.567f, 21.892f, 4.188f, 20.8f)
                curveTo(3.918f, 20.676f, 3.746f, 20.403f, 3.751f, 20.105f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
